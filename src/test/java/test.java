public class test {
    public static void main(String[] args) {
//        实例化一个400*500的窗口
        Game2048 game = new Game2048(400, 500);
//        窗口标题为2048
        game.setTitle("2048");
//        窗口位置位于屏幕中央
        game.setLocationRelativeTo(null);
//        显示窗口
        game.setVisible(true);
//        调用newGame，开始游戏
        game.newGame();
    }
}
