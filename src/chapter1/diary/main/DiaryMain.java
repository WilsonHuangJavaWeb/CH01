package chapter1.diary.main;

import chapter1.diary.bean.User;
import chapter1.diary.gui.DiaryWindow;

/**
 * Created by ki264 on 2017/2/7.
 */
public class DiaryMain {
    public static void main(String[] args) {
        try {
            //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        User user = new User("路人甲", "男", 20);
        DiaryWindow diaryWindow = new DiaryWindow(user);
        diaryWindow.setVisible(true);
    }
}
