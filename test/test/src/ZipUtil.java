import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;


public class ZipUtil{
	//解压文件夹下所有zip文件后删除zip原件
	public void unZip(String path){
		//\String path="C:\\Djx\\jartest_Pro\\data\\incoming\\billFile";
		ZipFile zipFile;
		String dir=path+"\\";
		File file = new File(dir);
		String[] names = file.list();
		for(int i=0;i<names.length;i++){
			if("zip".equals(names[i].substring(names[i].length()-3))){
				try {
					System.out.println(dir+names[i]);
					zipFile = new ZipFile(dir+names[i]);
					zipFile.extractAll(path);   
					File file1 = new File(dir+names[i]);
					file1.delete();
				} catch (ZipException e) {
					e.printStackTrace();
				}  
			}
		}
	}
	public static void main(String[] args) {
		String path="C:\\Djx\\jartest_Pro\\billFile";
		new ZipUtil().unZip(path);
	}
}