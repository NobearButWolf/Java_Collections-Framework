    /**
     * @Author:2017110342_吴谭波
     * @Description:实现简单的写日记功能
     * @Date: 2019/10/18
     * @Modified By:2017110342_吴谭波
     */

    package tanbo.wu.data.Menu;
    enum Weather{
        sunny,rainy,cloudy,windy,snowy
    }

    enum Mood{
        happy,sad,normal
    }

    public class Diary /*implements AddDiary,ReadDiary,SearchDiary*/{
        private Date date;  //日期
        private Weather weather;  //天气
        private Mood mood;  //心情
        private String title;  //标题
        private String content;  //内容


        Diary(Date date, Weather weather, Mood mood, String title, String content) {
            this.date = date;
            this.weather = weather;
            this.mood = mood;
            this.title = title;
            this.content = content;
        }

        Diary() {

        }

        public Date getDate() {
            return date;
        }

        String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        @Override
        public String toString(){
            return "时间是：" + date.getDate() + "\n"
                    + "天气是：" + weather + "\n"
                    + "心情是：" + mood + "\n"
                    + "日记标题是:" + title + "\n"
                    + "日记内容是：" + content;
        }
    }
