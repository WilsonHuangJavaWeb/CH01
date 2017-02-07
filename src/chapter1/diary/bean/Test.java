package chapter1.diary.bean;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Created by ki264 on 2017/2/7.
 */
public class Test {
    public static void main(String[] args) {
        User user = new User("Name", "Gender", 20);
        ArrayList<Diary> diaries = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            String authorName = user.getName();
            String title = "第" + i + "篇日記";
            String content = "第" + i + "篇日記的內容";
            GregorianCalendar time = new GregorianCalendar();
            Diary diary = new Diary(title, content, time, authorName);

            diaries.add(diary);
        }

        for (Diary diary : diaries) {
            System.out.println("日記作者：" + diary.getAuthorName());
            System.out.println("日記標題：" + diary.getTitle());
            System.out.println("日記內如：" + diary.getContent());

            GregorianCalendar time = diary.getTime();
            int year = time.get(GregorianCalendar.YEAR);
            int month = time.get(GregorianCalendar.MONTH)+1;
            int day = time.get(GregorianCalendar.DATE);
            int hour = time.get(GregorianCalendar.HOUR_OF_DAY);
            int minute = time.get(GregorianCalendar.MINUTE);

            System.out.println("日記時間：" + year + "-" + month + "-" + day + " " + hour + ":" + minute);
            System.out.println("****************************************");
        }

    }
}
