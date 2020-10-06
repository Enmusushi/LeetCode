#清理掉20天之前的无效数据,R 无法删除目录,r应该可以删除目录
find /home/enmusushi/.config/qv2ray  -mtime +21 -name "*" -exec rm -Rf {} \;

