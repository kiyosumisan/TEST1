import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class Test1
{
	public static void main(String[] args)
    {
        // Date�N���X�Ō��ݓ������擾
		Date d = new Date();
		//System.out.println(d);  //Wed Feb 21 10:48:21 JST 2018

        // SimpleDateFormat�N���X�ŕ\���`�����w��
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy'�N'M'��'dd'��'k'��'mm'��'");   // format(d)��d�́ADate d = new Date();��d
        //System.out.println(sdf.format(d));  //2018�N15��21�����j��11����15��23�b

        //�N���X�Ō��ݓ������擾
		sdf.setTimeZone(TimeZone.getTimeZone("Pacific/Honolulu"));
		System.out.println("���݂̃n���C�̎�����" + sdf.format(d) + "");  //2018�N02��21�����j��5����36��43�b
    }
}