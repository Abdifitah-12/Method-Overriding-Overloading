    class Person {

        // Version 1: no parameter
        public void display() {
            System.out.println("Person..");
        }

        // Version 2: one String parameter
        public void display(String name) {
            System.out.println("Name: " + name);
        }

        // Version 3: String + int (different number of parameters)
        public void display(String name, int age) {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    }


