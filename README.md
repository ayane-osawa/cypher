##システム要件
常に最新のバージョンを利用してください  
次は2021/9時点のバージョン

    Spring Boot 2.5.4
    Kotlin 1.5.31
    Java 11 以上
    Gradle 7以上
    その他必要なライブラリ

spring-boot-starter-webをdependenciesに設定してください

##課題

    Hello World API
        Hello Worldを返却するAPI。Spring Bootの基礎となる部分です。

##Hello World API

| No  | 課題                                   | やること                                                                                                                                                                                                                                                                                                                                                                                           | 
| --- | -------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | 
| 1   | Hello World                            | "Hello World" を Stringで返却するAPIを作成してください<br>    Spring Initializrを利用して作成してください。ブラウザでDownloadしてもIDEの機能を利用してもOKです<br>    Project名称はお好きなもので                                                                                                                                                                                            | 
| 2   | Hello World API                        | requestで name  を受け取り、例の通りのResponseをJsonで返却してください。<br>例:  {"message"":""Hello, $name""}"                                                                                                                                                                                                                                                                                    | 
| 3   | 設定していない PathへのRequestへの対応 | 設定していないPathにリクエストが来たときにHTTP Status 404でResponseをJsonで返却してください。<br>例: {"reason"":""no handler found""}"                                                                                                                                                                                                                                                             | 
| 4   | Exception&nbsp;対応                    | Applicationで例外が発生した際、HTTP Status 500でJsonを返却してください。<br>例:  {"reason"":""something wrong ;-(""}"                                                                                                                                                                                                                                                                              | 
| 5   | Validation                             | nameに「3文字以上10文字以内」のValidationを設定する<br>    ValidationExceptionが発生した際、HTTP Status 400でResponseをJsonで返却してください。<br>    例: {"reason"":""invalid parameter: detail: [hello.name: 3 から 10 の間のサイズにしてください]""}"                                                                                                                                          | 
| 6   | Spring Profilesごとに定数を定義する    | "    APIのResponseを  {""message"":""Hello $text, $name"} に修正してください<br>    textの値はapplication.ymlに定義してApplication内で利用してください<br>    spring profilesがdevのときはtextの値を変えてください<br>        spring profiles dev以外の場合の出力: {"message"":""Hello my best friend, foo"}<br>        spring profiles がdevの場合の出力: {"message"":""Hello my friend, foo""} " | 
| 7   | Debug Log                              | Applicationにdebug logを仕込み、request nameをlog出力してください<br>    自身の開発パッゲージにのみ設定するようにしてください (他のLibrary, 例えばspringframeworkのdebug logは出力しない)<br>    spring profilesがdevのときにだけdebug logを出力するようにしてください                                                                                                                             | 
| 8   | Kotlin Code Style                      | プロジェクトのKotlin formatをKotlin Code Styleにしてください (gradle.propertiesの設定)                                                                                                                                                                                                                                                                                                             | 
| 9   | その他                                 | graceful shutdown対応をしてください<br>    healthcheck対応をしてください                                                                                                                                                                                                                                                                                                                           | 
