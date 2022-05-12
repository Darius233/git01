<#--
    import 导入指令
        `import` 指令可以引入一个库。也就是说，它创建一个新的命名空间，
         然后在那个命名空间中执行给定路径的模板。可以使用引入的空间中的指令。

    include 包含
        可以使用 `include` 指令在你的模板中插入另外一个 FreeMarker 模板文件 。
        被包含模板的输出格式是在 `include` 标签出现的位置插入的。 被包含的文件和包含它的模板共享变量，就像是被复制粘贴进去的一样。
-->

<#import "03-常用指令.ftl" as zl>

<@zl.printCFB 3></@zl.printCFB>


<#include "test1.ftl">
<h3>主题页面内容</h3>
<#include "test2.ftl">
