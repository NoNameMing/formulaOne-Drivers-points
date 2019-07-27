/*
 * 说明：本来用于处理字符串，但 JSoup 中有更好的方法，我就没有再使用这个 "字符串清理方法"
 * 思路：准备先用这个方法去掉空格，然后再把字符串按比赛信息分割的。
 * 代替原因：JSoup 可以将元素按类型层层筛选拿取，我要的是 无序列表 ul 中各行 li 里面每个 span 的字符信息，
 * 就可以按标签层层拿数据，而不需要设定规则对字符串进行复杂的筛选。
 */

public class infoClean {
    public String clean(String str) {
        String strOut;
        strOut = str.replace(" ", "");
        return strOut;
    }
}
