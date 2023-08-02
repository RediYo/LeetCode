public class Code76 {
    
    public String minWindow(String s, String t) {

        //1.窗口必须大于等于t的长度
        //2.循环遍历进行延伸判断
        //3.如何判断t串字符在s字串中？s字串使用哈希表（字符，字符数量），然后进行判断删除，直到满足条件
        //优化：有没有可能加速子串判断，即遍历s字符时不需要一个一个遍历？
        //      跳过不属于t字符串的字符，因为增加此字符肯定更长，更不满足条件
        return null;
    }
}
