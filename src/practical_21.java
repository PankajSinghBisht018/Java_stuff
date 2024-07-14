class Circle {
    private double radius;
    private double area;
    private double circumference;
    private boolean radiusSet = false;

    public synchronized void setRadius(double radius) {
        // Wait until radius is consumed by calculateArea thread
        while (radiusSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.radius = radius;
        radiusSet = true;
        notify();
    }

    public synchronized void calculateArea() {
        // Wait until radius is set by setRadius thread
        while (!radiusSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        area = Math.PI * radius * radius;
        System.out.println("Area calculated: " + area);
        radiusSet = false;
        notify();
    }

    public synchronized void calculateCircumference() {
        // Wait until radius is set by setRadius thread
        while (!radiusSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        circumference = 2 * Math.PI * radius;
        System.out.println("Circumference calculated: " + circumference);
        radiusSet = false;
        notify();
    }
}

class AreaCalculator extends Thread {
    private Circle circle;
    private double radius;

    public AreaCalculator(Circle circle, double radius) {
        this.circle = circle;
        this.radius = radius;
    }

    public void run() {
        circle.setRadius(radius);
        circle.calculateArea();
    }
}

class CircumferenceCalculator extends Thread {
    private Circle circle;
    private double radius;

    public CircumferenceCalculator(Circle circle, double radius) {
        this.circle = circle;
        this.radius = radius;
    }

    public void run() {
        circle.setRadius(radius);
        circle.calculateCircumference();
    }
}

public class practical_21 {
    public static void main(String[] args) {
        Circle circle = new Circle();

        double radius = 5.0;

        AreaCalculator areaCalculator = new AreaCalculator(circle, radius);
        CircumferenceCalculator circumferenceCalculator = new CircumferenceCalculator(circle, radius);

        areaCalculator.start();
        circumferenceCalculator.start();
    }
}
