package Lessons_10.cloned_N2;

public class MyMain {
    public static void main(String[] args) {
        try {
            User[] users = new User[]{
                    new User(1, "Ryan Gosling", new Country("Canada"), 0, 1, 2),
                    new User(2, "Henry Cavill", new Country("United Kingdom"), 2, 1, 0),
                    new User(3, "Margot Robbie", new Country("Australia"), 9, 8 ,7)
            };
            // копируем пользователей Генри Каввил (A) и Марго Робии (B)
            User clonedUserA = myClone("deep", 2, users);
            User clonedUserB = myClone("shallow", 3, users);

            // изменяем страну Генри Кавилла, Марго Робби для проверки глубокого/поверхностного копирования
            // первый гет получает адрес Объекта Country из объекта User, сет изменяет название страны в Country
            users[1].getCountry().setCountry("USA");
            users[2].getCountry().setCountry("USA");

            // проверка возможностей поверхностного копирования изменением значений массива
            users[1].setNumbers(new int[]{1, 2, 3});
            users[2].setNumbers(new int[]{1, 2, 3});

            System.out.println("Глубокое копирование: \nИсходный " + users[1] + "\nКлон\t " + clonedUserA);
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Поверхностное копирование: \nИсходный " + users[2] + "\nКлон\t " + clonedUserB);


        } catch (CloneNotSupportedException e) {
            System.out.println("Ошибка с клонированием");
        }
    }
    // Метод для определения кого и как копировать
    // входные значение тип("deep", "shallow"), id кого копировать, массив User
    static User myClone(String typeClone, int userId, User[] users) throws CloneNotSupportedException {
        // проверка типа клонирования
        switch (typeClone) {
            case ("deep"):
                // пробегаем по массиву в пойсках нужного ID
                for(User user : users) {
                    if (user.getId() == userId) {
                        return (User) user.cloneDeep();
                    }
                }
                System.out.println("failed");
                System.out.println("проверьте Id для клонирования");
                return null;
            case ("shallow"):
                // комментарий выше
                for(User user : users) {
                    if (user.getId() == userId) {
                        return (User) user.clone();
                    }
                }
                System.out.println("failed");
                System.out.println("проверьте Id для клонирования");
                return null;
            // на случай ошибок
            default:
                System.out.println("failed");
                System.out.println("проверьте тип копирования");
                System.out.println("доступны: \"deep\", \"shallow\"");
                return null;
        }
    }
}
