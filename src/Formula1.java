/*
 * 作者：NoNameMing
 * 作用：从体育网站爬取、打印 F1 积分榜各车手信息
 * 参考：https://blog.csdn.net/mzy755423868/article/details/79010697
 */
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Formula1 {
    public static void main(String[] args) {
        TestJSoup testJSoup = new TestJSoup();
        String infoOut;
        Document document = testJSoup.document("https://sports.qq.com/f1/");
        // 获取目标 html 无序列表 ul
        Elements elements = document.select("[id=tabs_jfen][class=tabs tab_js]");
        // 搜寻 li 标签的元素
        Elements elements1 = elements.select("li");

        // 格式化输出方式
        for (int i = 3; i < 23; i++) {
            Element element = elements1.get(i);
            // 搜索 li 标签中的 span 标签
            Elements elements2 = element.select("span");
            // 依次输出各位车手的排名、姓名、车队、积分信息
            infoOut = elements2.get(0).text();
            System.out.print(infoOut + " ");
            infoOut = elements2.get(1).text();
            System.out.print(infoOut + " ");
            infoOut = elements2.get(2).text();
            System.out.print(infoOut + " ");
            infoOut = elements2.get(3).text();
            System.out.println(infoOut);
        }
    }
}
