
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.util.Map;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 */
public class Controller extends ActionSupport implements ServletRequestAware{
    User user;
 private File uploadFile;
 private String uploadFileContentType;
 private String uploadFileFileName; 
HttpServletRequest servletRequest=null;

    public HttpServletRequest getServletRequest() {
        return servletRequest;
    }

    

    public File getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(File uploadFile) {
        this.uploadFile = uploadFile;
    }

    public String getUploadFileContentType() {
        return uploadFileContentType;
    }

    public void setUploadFileContentType(String uploadFileContentType) {
        this.uploadFileContentType = uploadFileContentType;
    }

    public String getUploadFileFileName() {
        return uploadFileFileName;
    }

    public void setUploadFileFileName(String uploadFileFileName) {
        this.uploadFileFileName = uploadFileFileName;
    }

    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
     public String signup(){
         ServletContext servletContext = getServletRequest().getSession().getServletContext();
    String realPathofProject = servletContext.getRealPath("/");
   String removeBuildFromPath=realPathofProject.replace(File.separator+"build","");
   String destinationFolder=removeBuildFromPath+"upload";
   File filePath=new File(destinationFolder,this.uploadFileFileName);
   try{
       System.out.println("===================="+filePath);
        FileUtils.copyFile(uploadFile, filePath);
        String imagename=filePath.getName();
        user.setImagename(imagename);
       UserDao.addRecord(user);
     
   }
   catch(Exception e){
       e.printStackTrace();
   }
        System.out.println(destinationFolder);
   // UserDao.addRecord(user);
        return SUCCESS;
    }

    @Override
    public void setServletRequest(HttpServletRequest servletrequest) {
       this.servletRequest=servletrequest;
    }

    

    }
