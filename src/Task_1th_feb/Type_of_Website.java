package Task_1th_feb;

import java.util.Scanner;

public class Type_of_Website {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the site URL");
        String website_url = sc.next().toLowerCase();
        if(website_url.endsWith("xyz")){
            System.out.println("The website type is: Unknown or other types of websites");
        }else if(website_url.endsWith(".com/")){
            System.out.println("The website type is: Commercial website");
        } else if (website_url.endsWith(".org/")){
            System.out.println("The website type is: Non-profit organization");
        }else if (website_url.endsWith(".edu/")){
            System.out.println("The website type is: Educational institution");
        }else if (website_url.endsWith(".gov/")){
            System.out.println("The website type is: Government website");
        }else if (website_url.endsWith(".net/")){
            System.out.println("The website type is: Network-related website");
        }else if (website_url.endsWith(".info/")){
            System.out.println("The website type is: Informational website");
        }else{
            System.out.println("Please enter the correct format of url info");
        }


    }
    }

