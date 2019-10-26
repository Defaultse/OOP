package problem2;

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Driver {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		boolean Adminmode = false;
		String operation;
		Course course = new Course();//экземпляр класса Course
		String line;
		String str = "admin.txt";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Admin or User?");
        //Выбор админа или юзера
		if (scanner.nextLine().equals("Admin")) {
			System.out.print("Login: ");
			String username = scanner.nextLine();
			System.out.print("Password: ");
			String password = scanner.nextLine();
			FileReader fr = new FileReader(str);
			BufferedReader br = new BufferedReader(fr);//считывает с файла сохраненный аккаунт и пассворд и проверяет
			String user = br.readLine().split(" ")[1];//через пробел сразу считывает данные(Username, password деген жазуды окымайды)
			String pass = br.readLine().split(" ")[1];
			Adminmode = username.equals(user) && password.equals(pass); //если все ок то Adminmode
			if (Adminmode) {
				BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
                   
				while (!scanner.nextLine().equals("exit")) {                                   //вводим CourseTitle(OOP or algo...)
					System.out.println("Enter course title(which is being inserted):");
					while (!(line = console.readLine()).equals("quit")) {
						String[] splitted = line.split(" ");
						String courseTitle = splitted[0];
						course.setCourse(courseTitle);
						operation = "Added course" + courseTitle;
						adminLogs(operation);                      //записывает действия в admin.txt  //снизу есть функция для этого
					}

					System.out.println("Enter Text Book of Inserted Course(title, isbn, author)");    //adding book
					BufferedReader console1 = new BufferedReader(new InputStreamReader(System.in));
					while (!(line = console1.readLine()).equals("quit")) {
						String[] splitted = line.split(" ");
						String title = splitted[0];
						String isbn = splitted[1];
						String author = splitted[2];
						Textbook textbook = new Textbook(title, isbn, author);//отправляем обьект в класс Course
						course.setCourse(textbook);
						operation = "Added Book" + title + " " + isbn + " " + author;
						adminLogs(operation);
					}

					System.out.println("Enter Instructor of Inserted Course(Name, LastName, Department, email)");
					BufferedReader console2 = new BufferedReader(new InputStreamReader(System.in));                    //adding instructor
					while (!(line = console2.readLine()).equals("quit")) {
						String[] splitted = line.split(" ");
						String name = splitted[0];
						String lastname = splitted[1];
						String department = splitted[2];
						String email = splitted[3];
						console2.close();
						Instructor instructor = new Instructor(name, lastname, department, email);//отправляем обьект в класс Course
						course.setCourse(instructor);
						operation = "Added Instructor" + name + " " + lastname + " " + department + " " + email;
						adminLogs(operation);
					}
				}
				course.Serialize();  //сериализует все  это дерьмо
			}

		} else if (scanner.nextLine().equals("User")) {
			Course courseInfo = new Course();
			courseInfo.Deserialize();//читает то что ввел админ 
		}

	}

	static void adminLogs(String operation) throws IOException {
		File file = new File("admin.txt");
		FileWriter writer = new FileWriter(file.getAbsoluteFile(), true);
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = myDateObj.format(myFormatObj);
		writer.write("\r\n" + operation + " " + formattedDate);
		writer.flush();
		writer.close();
	}
}
