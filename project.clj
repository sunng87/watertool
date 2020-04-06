(defproject watertool "0.0.1-SNAPSHOT"
:test-paths ["test"]
:plugins [[lein-jupyter "0.1.16"]]
:auto {:default {:file-pattern #"\.(clj)$"}}
:main watertool.core
:repositories [["vendredi" "https://repository.hellonico.info/repository/hellonico/"]]
:aliases {"notebook" ["gorilla" ":ip" "0.0.0.0" ":port" "10000"]}
:profiles {:gorilla {
  :resource-paths ["resources"]
  :dependencies [
  ; used for proto repl
  [org.clojure/tools.nrepl "0.2.11"]
  ; proto repl
  [proto-repl "0.3.1"]
  ; use to start a gorilla repl
  [hellonico/gorilla-repl "0.4.1"]
  [seesaw "1.4.5"]]
  }}
:dependencies [
 [org.clojure/clojure "1.10.1"]
 [org.clojure/tools.cli "0.3.5"]
 [origami "4.2.0-1"]

 ; uncomment to use only the binary for your platform
 ;[origami "4.0.0-1" :exclusions [opencv/opencv-native]]
 ;[opencv/opencv-native "4.0.0-0" :classifier "osx_64"]
 [opencv/opencv-native "4.0.0-0" :classifier "linux_64"]
 ;[opencv/opencv-native "4.0.0-0" :classifier "windows_64"]

 ])
