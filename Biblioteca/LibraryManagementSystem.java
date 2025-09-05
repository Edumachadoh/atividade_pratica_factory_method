public class LibraryManagementSystem {
    public static void main(String[] args) {
        
        // Criar um objeto do tipo IBorrowable para garantir o polimorfismo conseguir gerar objetos de tipos diferentes
        // O cliente cria um objeto "emprestavel" IBorrowable do tipo que deseja, Book, Magazine, DigitalMedia ou vários itens do mesmo ou de outro tipo 
        // Do jeito que está montado o usuário tem de criar o objeto, por exemplo Book e como parâmetro ja definir seus atributos próprios e os atributos herdados de LibraryItem, pois existe uma relação de herança entre essas classes.

        IBorrowable item = new Book("Harry Potter", "Jack Frigman", 2012, 175);
        item.showInfo();
        item.borrow();
        item.returnItem();

        IBorrowable item2 = new Magazine("Forbes edição 2025", "Forber", 2025, "Veja como o Top 1 Forbes professor Escobar virou arquiteto de software");
        item2.showInfo();
        item2.returnItem();

        IBorrowable item3 = new Digitalmedia("Os primeiros dinossauros", "Jurassic Park", 2002, "10MB");
        item3.borrow();
        item3.returnItem();

        IBorrowable[] items = new IBorrowable[] {
            new Book("Analise de Dados", "Frank Bolmann", 2010, 201),
            new Magazine("Revista Veja: Politica em pauta", "Revista Veja", 2021, "Presidente da Bolívia toma posse e leva tortada na cara"),
            new Digitalmedia("Como caçar Pokemon", "Nintendo", 2000, "1.5MB")
        };

        items[1].showInfo();

    }
}
