package online.shixun.project.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * 上传文件控制类
 * 
 * @author Administrator
 *
 */
@Controller
public class FileUploadController {
	/**
	 * 进入上传文件页面
	 * 
	 * @return
	 */
	@RequestMapping("/upload/page")
	public String uploadPage() {
		return "upload";

	}

	/**
	 * TODO 执行文件上传
	 * 
	 * @param file
	 *            上传获取到的文件
	 * @return 返回成功页面
	 */
	@RequestMapping(value = "/doUpload", method = RequestMethod.POST)
	public String doUploadFile(@RequestParam("file") MultipartFile file) {

		if (!file.isEmpty()) {
			try {

				// 这里将上传得到的文件保存至 d:\\temp\\file 目录
				FileUtils.copyInputStreamToFile(file.getInputStream(),
						new File("d:\\temp\\file\\", System.currentTimeMillis() + file.getOriginalFilename()));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return "success"; // 上传成功则跳转至此success.jsp页面
	}
}