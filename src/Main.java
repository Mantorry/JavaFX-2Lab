public class Main {
    public interface LambdaFunction {
        public void run();

    }
    public static void main(String[] args) {
        LambdaFunction Faculties = () -> {
            int idFaculty;
            String NameFaculty, ShortNameFaculty;
            idFaculty = 1;
            NameFaculty = "Компьютерные технологии и информационная безопасность";
            ShortNameFaculty = "КТиИБ";

            System.out.println("ID: "+ idFaculty + "\nНазвание факультета: "
                    + NameFaculty + "\nАббревиатура: " + ShortNameFaculty);
        };
        LambdaFunction Chairs = () -> {
            int idChair, idFaculty, Code;
            String NameChair, ShortNameChair;
            idChair = 1;
            idFaculty = 1;
            Code = 3;
            NameChair = "Информационные системы и технологии в бизнесе";
            ShortNameChair = "ИСТ";

            System.out.println("ID: " + idChair + "\nID факультета: "
                    + idFaculty +"\nНомер кафедры: "+ Code + "\nНазвание кафедры: " + NameChair
                    + "\nАббревиатура: " + ShortNameChair);
        };
        LambdaFunction Posts = () -> {
            int idPost;
            String NamePost;
            idPost = 1;
            NamePost = "Зав.Кафедры";

            System.out.println("ID: " + idPost + "\nДолжность: " + NamePost);
        };
        LambdaFunction Teachers = () -> {
            int idTeacher, idChair, idPost;
            String FirstName, SecondName, LastName, Email, Phone;
            idTeacher = 1;
            idChair = 1;
            idPost = 1;
            FirstName = "Сергей";
            SecondName = "Щербаков";
            LastName = "Михайлович";
            Phone = "88005553535";
            Email = "Почта@mail.ru";
            System.out.println("ID: " + idTeacher + "\nID кафедры: " + idChair
                    + "\nID должности: " + idPost + "\nФИО: " + SecondName + " "
                    + FirstName + " " + LastName + "\nНомер телефона: "
                    + Phone + "\nПочта: " + Email);
        };
        System.out.println("-----Факультеты-----");
        Faculties.run();
        System.out.println("\n-----Кафедры-----");
        Chairs.run();
        System.out.println("\n-----Должности-----");
        Posts.run();
        System.out.println("\n-----Преподаватели-----");
        Teachers.run();
    }
}
