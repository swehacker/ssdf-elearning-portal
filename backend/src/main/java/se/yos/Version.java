package se.yos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import se.yos.course.CourseAdministration;

import java.io.IOException;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

@Controller
@RequestMapping("/version")
public class Version {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public @ResponseBody
    Map getVersion() {

        CourseAdministration.createCourse();

        Manifest mf = new Manifest();
        try {
            mf.read(Thread.currentThread().getContextClassLoader().getResourceAsStream("META-INF/MANIFEST.MF"));
        }  catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return mf.getMainAttributes();
    }
}
