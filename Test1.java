import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class Test1
{
	public static void main(String[] args)
    {
        // Dateクラスで現在日時を取得
		Date d = new Date();
		//System.out.println(d);  //Wed Feb 21 10:48:21 JST 2018

        // SimpleDateFormatクラスで表示形式を指定
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy'年'M'月'dd'日'k'時'mm'分'");   // format(d)のdは、Date d = new Date();のd
        //System.out.println(sdf.format(d));  //2018年15月21日水曜日11時間15分23秒

        //クラスで現在日時を取得
		sdf.setTimeZone(TimeZone.getTimeZone("Pacific/Honolulu"));
		System.out.println("現在のハワイの時刻は" + sdf.format(d) + "");  //2018年02月21日水曜日5時間36分43秒
    }
}