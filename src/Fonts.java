/**
 * @param
 * ~@
 */
// 正體字/繁體字
// 中文字体下
// Љ Ћ Ќ Ў Џ Ж Ϭ Щ Ю Я Ф Ы В А
//วรรณยุกต์ = อ่อ้อ๊อ๋อ์อํอ็รนย ไม้เอก อะ อิ
//สระ = อิอีอึอือั

public class Fonts {
    public static void main(String[] args) {
        String cyrillic = "Љ Ћ Ќ Ў Џ Ж Ϭ Щ Ю Я Ф Ы В А Щ Ю Я Ф Ы В А";
        String chineese = "前風格京客隆 好久和沝";
        String russian = "ываываываыа фыв фыв цумцумцум ";
        String persian = "اتنسسا شسی شسی نتارزیق۶ه";
        String thai = "วรรณยกต์ = อ่อ้อ๊อ๋อ์อํอ็";
        String japaneese = "tesッッッｯッヒュrッワンmおrhwっっっjkｯdfgﾋｨｴｱ";
        String emoji = "😛©🐼☺";

        String ligature = "=> >= ~@";

        System.out.println(thai);
        System.out.println(cyrillic);
        System.out.println(chineese);
        System.out.println(persian);
        System.out.println(russian);
        System.out.println(japaneese);
        System.out.println(emoji);
        System.out.println(ligature);

        System.out.println("Other people can suggest specific changes to your pull request. " +
                "You can apply these suggested changes directly in a pull request if you have write access " +
                "to the repository. Some changes here. If the pull request was created from a fork and the author allowed edits " +
                "from maintainers, you can also apply suggested changes if you have write access " +
                "to the upstream repository. For more information, see Commenting on a pull request and" +
                " Allowing changes to a pull request branch created from a fork.");
    }
}
