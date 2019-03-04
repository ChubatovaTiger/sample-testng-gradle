import org.gradle.api.DefaultTask
import org.gradle.api.tasks.*

class SemurugaTask extends DefaultTask {
    String message = "This is the default message of SemurugaTask"

    @TaskAction
    def welcome() {
        println message
        10.times {
          println "${project.name} - ${this.name} time: $it"
          sleep 1000
        }
    }
}
