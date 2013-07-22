package se.yos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

        Manifest mf = new Manifest();
        try {
            mf.read(Thread.currentThread().getContextClassLoader().getResourceAsStream("META-INF/MANIFEST.MF"));
        }  catch (IOException ioe) {
            ioe.printStackTrace();
        }


        Attributes atts = mf.getMainAttributes();

        System.out.println("Created-By: " + atts.getValue("Created-By"));
        System.out.println("Built-By: " + atts.getValue("Built-By"));
        System.out.println("Specification-Title: " + atts.getValue("Specification-Title"));
        System.out.println("Specification-Vendor: " + atts.getValue("Specification-Vendor"));
        System.out.println("Specification-Version: " + atts.getValue("Specification-Version"));
        System.out.println("Implementation-Title: " + atts.getValue("Implementation-Title"));
        System.out.println("Implementation-Version: " + atts.getValue("Implementation-Version"));
        System.out.println("Implementation-Build: " + atts.getValue("Implementation-Build"));

        return mf.getEntries();
    }
}
