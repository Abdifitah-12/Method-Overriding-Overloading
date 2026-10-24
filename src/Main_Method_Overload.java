//public class Main_Method_Overload {
          void main(String[] args) {
            Person p = new Person();

            p.display();                  // calls Version 1
            p.display("Abdifitah");       // calls Version 2
            p.display("Abdifitah", 20);   // calls Version 3
        }
