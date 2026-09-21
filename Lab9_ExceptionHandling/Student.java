package Lab9_ExceptionHandling;

public class Student {
        void AddStudent() {
            class MtechStudent implements Admission {
                public void registration() {
                    System.out.println("M.Tech Student Registration Completed.");
                }
            }
            MtechStudent m1 = new MtechStudent();
            m1.registration();
            Admission a1 = new Admission() {
                public void registration() {
                    System.out.println("Anonymous Student Registration Completed.");
                }
            };
            a1.registration();
        }
        public static void main(String[] args) {
            Student s = new Student();
            s.AddStudent();
        }

    public void display() {
    }
}
