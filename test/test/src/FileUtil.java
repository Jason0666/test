import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;


public class FileUtil {
	
	//�ƶ��ļ�
	public boolean moveFile(String filePath,String newPath){
		File f=new File(filePath);
		String n=newPath + f.getName();
		return f.renameTo(new File(n)); 
	}
	
	
	//�����ļ�
	public boolean copyFile(String oldPath,String newPath){
		boolean flag=false;
		try {
			int bytesum=0;
			int byteread=0;
			File oldfile=new File(oldPath);
			if(oldfile.exists()){
				InputStream inStream=new FileInputStream(oldfile);
				FileOutputStream fs=new FileOutputStream(newPath);
				byte[] buffer=new byte[8192];
				while((byteread=inStream.read(buffer))!=-1){
					bytesum += byteread;
					fs.write(buffer, 0, byteread);
				}
				inStream.close();
				flag=true;
			}
		} catch (Exception e) {
			System.out.println("���Ƶ����ļ�����");
			e.printStackTrace();
		}
		return flag;
	}
	
	public static void main(String[] args) {
		FileUtil test=new FileUtil();
		//�ƶ��ļ�
		//System.out.println(test.moveFile("C://Djx//jartest_Pro//billFile//111.txt","C://Djx//jartest_Pro//billFileRemark//"));
		//�����ļ�
		//System.out.println(test.copyFile("C://Djx//jartest_Pro//billFile//111.txt","C://Djx//jartest_Pro//billFileRemark//111.txt"));
		
		 
}
}
