package webcrawler;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter URL: ");
        String inputUrl = input.nextLine();
        WebCrawler webCrawler = new WebCrawler(inputUrl);
        webCrawler.start();
    }
}