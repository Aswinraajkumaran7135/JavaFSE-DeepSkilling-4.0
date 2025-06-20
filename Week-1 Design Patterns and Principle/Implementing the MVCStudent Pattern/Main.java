public class Main {
    public static void main(String[] args) {
        // Create Model and View
        Student model = new Student("Rahul", "101", "A");
        StudentView view = new StudentView();

        // Create Controller
        StudentController controller = new StudentController(model, view);

        // Display initial details
        controller.updateView();

        // Modify the model
        controller.setStudentName("Anjali");
        controller.setStudentGrade("A+");

        // Display updated details
        controller.updateView();
    }
}
