package model;

import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class clock {

    private Timer timer;

    public clock(JLabel timeLabel) {
        // 初始化 Timer，每秒更新一次
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTime(timeLabel);
            }
        });

        timer.start();
    }

    // 更新時間的方法
    private void updateTime(JLabel timeLabel) {
        // 這裡可以擴充其他邏輯，例如通知其他 UI 更新時間
        String formattedTime = getCurrentTime();
        timeLabel.setText("現在時間: " + formattedTime);
    }

    // 獲取格式化的當前時間
    private String getCurrentTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
        return dateFormat.format(new Date());
    }

    // 開始計時器
    public void startTimer() {
        timer.start();
    }

    // 停止計時器
    public void stopTimer() {
        timer.stop();
    }
}
