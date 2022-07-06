# handson-MyBatis

## ファイル構成
```
.
├── 
├── .gradle
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── mysql-docker
│   ├── docker-compose.yml
│   └── my.cnf
├── settings.gradle
└── src
    ├── main
    │   ├── java
    │   │   └── handson
    │   │       ├── App.java
    │   │       ├── Blog.java
    │   │       └── BlogMapper.java
    │   └── resources
    │       └── mybatis-config.xml
    └── test
        ├── java
        └── resources
```
- mysql-docker 
MySQL Server

## DB構築
```bash
# mysql-dockerフォルダーにcdコマンドで移動
cd mysql-docker

# dockerコンテナを立ち上げる
docker-compose up -d

# dockerコンテナ内に入る準備をする
docker-compose exec mysql bash

# Mysqlにログインする
mysql -u root -p

# データベースを作成する
CREATE DATABASE mydb;

# データベースを選択
USE mydb;

# テーブル作成とデータ追加
CREATE TABLE blogs (id INT, title VARCHAR(128));
INSERT INTO blogs VALUES (1, 'xxx'), (2, 'yyy');
```