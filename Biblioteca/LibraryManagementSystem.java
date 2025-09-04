public class LibraryManagementSystem {
    public static void main(String[] args) {
        
        // Criar um objeto do tipo IBorrowable para garantir o polimorfismo conseguir gerar objetos de tipos diferentes
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
