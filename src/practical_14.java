
interface Study {
    void study();
}

interface Sports {
    void playSports();
}

interface Extracurricular {
    void participate();
}

class CollegeStudent implements Study, Sports, Extracurricular {
    @Override
    public void study() {
        System.out.println("College student studying");
    }

    @Override
    public void playSports() {
        System.out.println("College student playing sports");
    }

    @Override
    public void participate() {
        System.out.println("College student participating in extracurricular activities");
    }
}
public class practical_14 {
    public static void main(String[] args) {
        CollegeStudent student = new CollegeStudent();

        student.study();
        student.playSports();
        student.participate();
    }
}
