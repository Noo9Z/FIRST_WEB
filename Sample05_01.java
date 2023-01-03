class StudentWorker extends Student{
	public void work() {
		
	}
}




public class Sample05_01 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person();
		Student student = new Student();
		StudentWorker student_worker = new StudentWorker();
		
		person.eat();
		
		student.eat();
		student.study();
		
		student_worker.eat();
		student_worker.study();
		student_worker.work();
		
	}

}
