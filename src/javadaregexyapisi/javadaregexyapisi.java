
package javadaregexyapisi;
//gerekli kutuphaneler
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class javadaregexyapisi {

    //degiskenler tanimlaniyor.
    public static int mailsayac=0;
    public static int kelimesayac=0;
    public static int cumlesayac=0;
    public static int websitesayac=0;
    public static int sesliharfsayac=0;
    public static char [] sesliharf={'a','e','ı','i','o','ö','u','ü',
                                    'A','E','I','İ','O','Ö','U','Ü'};//sesli harf dizisi
    public static String mailpattern="\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}\\b";
    public static String cumlepattern="([a-zA-Z]+(\\.|\\. |'(s |re |t |m |ll )|s' | )?)+(\\.\\s*$)";
    public static String websitepattern="\\b(https|http|www)(://|\\.)[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|](.com|.edu|.net|.org|.com.tr|.edu.tr|.net.tr|.org.tr)\\b";
    public static void main(String[] args) {

        //txt dosyasi kelime kelime okunuyor.
           Scanner sc2 = null;
    try {
        sc2 = new Scanner(new File("icerik.txt"));
    } catch (FileNotFoundException e) {
        e.printStackTrace();  
    }
    while (sc2.hasNextLine()) {
            Scanner s2 = new Scanner(sc2.nextLine());
        while (s2.hasNext()) {
            String s = s2.next();
            kelimesayac++;//toplam kelime sayisi bulunuyor.
            //toplam mail sayisi bulunuyor.
            Pattern c = Pattern.compile(mailpattern);
             Matcher d = c.matcher(s);
            if (d.find( )) {
         mailsayac++;
            }
            
            //toplam cumle sayisi bulunuyor.
            Pattern a = Pattern.compile(cumlepattern);
             Matcher b = a.matcher(s);
            if (b.find( )) {
         cumlesayac++;
            }
            
            //toplam website sayisi bulunuyor.
            Pattern e = Pattern.compile(websitepattern);
             Matcher f = e.matcher(s);
            if (f.find( )) {
         websitesayac++;
            }
            
            //toplam sesli harf sayisi bulunuyor.
            for(int i = 0 ; i<=s.length()-1;i++)
                    {
                    for(int j= 0 ; j<=15;j++)
                    {
                    if(s.charAt(i)==sesliharf[j])
                    {sesliharfsayac++;}
                    }
                    }
        }
    }
    //ekrana yazdiriliyor.
    System.out.println("Toplam sesli harf sayisi: "+sesliharfsayac);
    System.out.println("Toplam kelime sayisi: "+kelimesayac);
    System.out.println("Toplam cumle sayisi: "+cumlesayac);
    System.out.println("Toplam mail sayisi: "+mailsayac);    
    System.out.println("Toplam website sayisi: "+websitesayac);
    
    }
}
