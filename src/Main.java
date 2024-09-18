public class Main {
    public static void main(String[] args) {

Teacher t1 = new Teacher("Mahmut Hoca ","555","TRH");
Teacher t2 = new Teacher("Graham Bell ","0000","FZK");
Teacher t3 = new Teacher("Külyutmaz ","111","BIO");
Course tarih = new Course("Tarih","101","TRH");
tarih.addTeacher(t1);

Course fizik = new Course("Fizik","102","FZK");
fizik.addTeacher(t2);

Course biyo = new Course("Biyoloji","103","BIO");
biyo.addTeacher(t3);

Student s1= new Student("İnek Şaban","123","4",tarih,fizik,biyo);
s1.addBukExamNote(100,200,50);;
s1.printNote();



    }
}