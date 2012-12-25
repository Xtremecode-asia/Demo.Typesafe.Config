package demo.typesafe.config.spec;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.LoadFromRelativeFile;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: wendysa
 * Date: 25/12/12
 * Time: 11:10 PM
 */
public abstract class FeatureBase extends JUnitStory {
    // Here we specify the configuration, starting from default MostUsefulConfiguration, and changing only what is needed
    @Override
    public Configuration configuration() {
        // where to find the stories
        URL storyURL = null;
        try {
            storyURL = new URL("file://" + System.getProperty("user.dir") + "/src/spec/resources");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return new MostUsefulConfiguration()
                // where to find the stories
                .useStoryLoader(storyURL != null ? new LoadFromRelativeFile(storyURL) :  new LoadFromClasspath(this.getClass()))
                        // CONSOLE and TXT reporting
                .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE, Format.TXT));
    }
}



