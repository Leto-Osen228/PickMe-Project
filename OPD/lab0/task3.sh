#!/usr/bin/bash

# cоздать жесткую ссылку для файла klang6 с именем lab0/treecko5/yanmaklang
ln ./klang6 ./trecho5/yanmaklang

# cоздать символическую ссылку для файла staravia0 с именем lab0/bronzong4/oshawottstaravia
ln -s ../staravia0 ./bronzong4/oshawottstaravia

# создать символическую ссылку c именем Copy_37 на директорию bronzong4 в каталоге lab0
ln -s ./bronzong4 ./Copy_37

# скопировать рекурсивно директорию tentacruel6 в директорию lab0/tentacruel6/lilligant
cp -r ./tentacruel6 ./tentacruel6/lilligant/

# скопировать содержимое файла snover7 в новый файл lab0/treecko5/drapionsnover
cp ./snover7 ./trecho5/drapionsnover

# объеденить содержимое файлов lab0/bronzong4/oshawott, lab0/tentacruel6/budew, в новый файл lab0/snover7_91
cat ./bronzong4/oshawott ./tentacruel6/bedew > ./snover7_91

# скопировать файл snover7 в директорию lab0/bronzong4/lileep
cp ./snover7 ./bronzong4/lileep/