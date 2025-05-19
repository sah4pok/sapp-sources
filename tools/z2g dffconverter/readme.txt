Non-standard DFF converter for Gmax/KAMS

■はじめに
本プログラムは、"Non-standard DFF!"のエラーにより
Gmax/KAMSでインポートできないdffファイルを
インポート可能なフォーマットに変換するものです。

■使用方法
1.変換元のdffファイルを本プログラムのアイコンまたはショートカットににDrag&Dropする。
2.変換元dffと同じフォルダに「ファイル名+"_z2g.dff"」というファイル名で
　変換ファイルが出力される。

※変換時にコンソールが現れ、変換が正常終了した場合は、
　「conversion : done successfully」と表示されます。
　なにかエラーがあった場合、それっぽいメッセージが表示されます。

※コンソールはなにかキーを入力することで閉じます。


■諸注意
・本プログラムは私の把握する範囲のエラー要因を修正するものであり、
　全ての"Non-standard DFF"を修正できるとは限りません。

・KAMSエラー要因のひとつである"2nd UV MAP"を持つdffファイルに対しては、
　片方のUV MAPを削除することによってKAMS対応形式に変換します。
　ご理解のうえご使用ください。

・本プログラムはプラグイン間の仕様差を修正するものであり、
　dffファイルを編集した方の意図により設定された「ロック」を解除するものではありません。

■変換による修正個所
1.「メッシュ構築用のfaceデータのvertex順 」と「material splitに用いるfaceデータのvertex順」に
　不整合がある場合、material split用のfaceデータを修正します。
　※vertex記載順の変更のみ。この変換によるモデル情報の変化はありません。

2.dffに"2nd UV MAP"が設定されている場合、二つのUV MAPのうちいずれかを削除します。

3.ファイル終端(Clump外)にRWヘッダの無いヌルデータ列があった場合、これを削除します。
　※場合によってはdffファイルサイズが半分以下になる場合がありますが、
　　私の確認した範囲では、削除されるのは'0'のデータ列で、
　　削って問題が起こることはありませんでした。

■uvselフォルダについて
　"z2g_dffconverter"は2nd UV Mapを検出したときに、ひとつめのUV Mapを残すよう動作しますが、
　uvselフォルダに同梱した「"z2g_dffconverter_uvsel"」は、どちらのUV Mapを残すか選択することができます。
　2nd UV Mapを検出すると、コンソールに「Select Import UV map」と表示されますので、
　数値キー入力でUV Mapを選択してください。
　その他の動作は"z2g_dffconverter"と同じです。

■コンパイル環境
  Borland C++ 5.5.1 for Win32 Copyright (c) 1993, 2000 Borland
    option : -WC -3 -O2 -w- -AT -pc -H- -k -b
  on BCC Developer v1.2.21
  

■更新履歴
2010.9.21
　- VC用dffに対応
　　・RWヘッダのVersion ID:0x0C02FFFF,0x1003FFFF,0x0800FFFFに対応
　　・上記dffの「Geometry > Struct」処理に
　　　"Ambient color", "Diffuse color", "Specular color" (float x3)
　　　の読み書きを追加
　- コンソール表示を修正

---
2010.9.21 (更新)VC用dffに対応
2010.7.5
名無し
http://ponz2009.web.fc2.com/