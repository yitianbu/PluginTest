package weifeng.android.com

/**
 * @anthor weifeng
 * @time 2019-05-29 17:56
 */
import org.gradle.api.Plugin
import org.gradle.api.Project

 class GreetingPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.task('hello') {
            doLast {
                println "Hello from the GreetingPlugin"
            }
        }
    }
}