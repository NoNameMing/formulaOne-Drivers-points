/*
 * 类名：测试连接
 * 作者：CSDN博主 微末666
 * 实现：NoNameMing
 */

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class TestJSoup {
    public Document document (String url) {
        try {
            return Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
