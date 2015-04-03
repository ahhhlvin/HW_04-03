package nyc.c4q.ahhhlvin;

import java.net.URL;
import java.util.Scanner;

/**
 * Created by alvin2 on 3/30/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 *
 * Search engines like Google have programs called web-scapers which visit webpages and scrape the information displayed on the webpage. The displayable information is contained in html tags like p, table, h2 etc. When we make a GET request for a webpage, the HTML that is returned can also contain tags like script which often do not correspond to the displayable content on the webpage. Information inside script tags is not used by scapers and they often ignore these tags in the HTML. Write a class called WebPageSanitizer which implements a static method called String sanitize(String html) which removes all script tags and the information that they encapsulate and returns a sanitized version of the HTML string.
 */
public class WebPageSanitizer
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        System.out.println("Please input the URL of a website to render: ");
        String html = input.nextLine();
        StringSanitize(webToURL(html));

    }


    public static String StringSanitize(String html)
    {

        int firstIndex;
        int secondIndex = 0;
        String fin = "";

        int wordCount = HTTP.countWords(html, "<script");


        for(int i = 0; i < wordCount; i++)
        {

            firstIndex = html.indexOf("<script", secondIndex);
            secondIndex = html.indexOf("</script>", firstIndex);
            String removePart = html.substring(firstIndex, secondIndex);
            String removed = html.replaceAll(removePart, "");
            fin += removed;
        }
        return fin;
    }

    public static String webToURL(String webPage)
    {
        URL webUrl = HTTP.stringToURL(webPage);
        String str = HTTP.get(webUrl);

        return str;
    }

}
