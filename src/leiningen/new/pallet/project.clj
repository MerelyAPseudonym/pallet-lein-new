(defproject {{name}} "{{project-version}}"
  :description "FIXME Pallet project for {{name}}"
  :dependencies [[org.cloudhoist/pallet "{{pallet-version}}"]
                 {{#with-automated-admin-user-dependency}}
                 [org.cloudhoist/automated-admin-user "0.6.0"]
                 {{/with-automated-admin-user-dependency}}
                 [org.slf4j/slf4j-api "1.6.1"]
                 [ch.qos.logback/logback-core "1.0.0"]
                 [ch.qos.logback/logback-classic "1.0.0"]
                 {{#with-jclouds}}
                 ;; [org.jclouds.driver/jclouds-slf4j "{{jclouds-version}}"]
                 ;; [org.jclouds/jclouds-all "{{jclouds-version}}"]
                 [org.cloudhoist/pallet-jclouds "{{jclouds-version}}"]
                 {{/with-jclouds}}]
  :dev-dependencies [[org.cloudhoist/pallet "{{pallet-version}}" :type "test-jar"]
                     {{#with-vmfest}}
                     [vmfest "{{vmfest-version}}"]
                     {{/with-vmfest}}
                     {{#with-growl}}
                     [org.cloudhoist/pallet-growl "{{pallet-growl-version}}"]
                     {{/with-growl}}]
  :local-repo-classpath true
  :repositories
  {"sonatype-snapshots" "https://oss.sonatype.org/content/repositories/snapshots"
   "sonatype" "https://oss.sonatype.org/content/repositories/releases/"})
