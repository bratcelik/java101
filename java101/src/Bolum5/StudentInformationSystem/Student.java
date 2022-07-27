package Bolum5.StudentInformationSystem;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int quizMat, int fizik, int quizFizik, int kimya, int quizKimya) {

        if (isValidGrade(mat) && isValidGrade(quizMat)) {
            this.mat.note = mat;
            this.mat.quiz = quizMat;
        }

        if (isValidGrade(fizik) && isValidGrade(quizFizik)) {
            this.fizik.note = fizik;
            this.fizik.quiz = quizFizik;
        }

        if (isValidGrade(kimya) && isValidGrade(quizKimya)) {
            this.kimya.note = kimya;
            this.kimya.quiz = quizKimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiþ");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sýnýfý Geçti. ");
            } else {
                System.out.println("Sýnýfta Kaldý.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = this.mat.note*(1d-this.mat.quizPercent) + this.mat.quiz*this.mat.quizPercent;
        this.avarage += this.fizik.note*(1d-this.fizik.quizPercent) + this.fizik.quiz*this.fizik.quizPercent;
        this.avarage += this.kimya.note*(1d-this.kimya.quizPercent) + this.kimya.quiz*this.kimya.quizPercent;
        this.avarage /= 3d;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öðrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + "\t- Matematik quizi : "+this.mat.quiz);
        System.out.println("Fizik Notu : " + this.fizik.note + "\t- Fizik quizi : "+this.fizik.quiz);
        System.out.println("Kimya Notu : " + this.kimya.note + "\t- Kimya quizi : "+this.kimya.quiz);
    }

    public boolean isValidGrade(int x){
        return (x >= 0) && (x <= 100);

    }
}
