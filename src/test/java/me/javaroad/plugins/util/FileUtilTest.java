package me.javaroad.plugins.util;

import com.intellij.openapi.util.io.FileUtil;
import me.javaroad.plugins.settings.TemplateSettings;

import java.io.IOException;

/**
 * @author heyx
 */
public class FileUtilTest {

//    @Test
    public void loadText() throws IOException {
        String content = FileUtil.loadTextAndClose(TemplateSettings.class.getResourceAsStream("/templates/Mapper.vm"));
//        Assert.assertEquals(true, StringUtils.isNotBlank(content));
    }
}
