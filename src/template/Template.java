package template;

public class Template {

    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        Beverage blackCoffee = new BlackCoffee();

        System.out.println("--- 일반 커피 준비 ---");
        coffee.prepareRecipe();

        System.out.println("\n--- 블랙 커피 준비 ---");
        blackCoffee.prepareRecipe();
    }
}
