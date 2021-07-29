var topPage =
    "<nav id='topPage' class=\"navbar navbar-inverse\" role=\"navigation\">\n" +
    "  <ul class=\"nav navbar-nav\" >\n" +
    "    <li>\n" +
    "      <a href=\"monster.html\">\n" +
    "        怪物详细资料\n" +
    "      </a>\n" +
    "    </li>\n" +
    "    <li><a href=\"weakness.html\" >怪物弱点</a></li>\n" +
    "    <li>\n" +
    "      <a href=\"gene.html\">基因表</a>\n" +
    "    </li>\n" +
    "    <li>\n" +
    "      <a href=\"egg.html\" >[蛋]外观</a>\n" +
    "    </li>\n" +
    "    <li>\n" +
    "      <a href=\"zone.html\" >探索地带</a>\n" +
    "    </li>\n" +
    "    <li style=\"alignment:right\">\n" +
    "      <a href=\"localWeaknessList.html\">购物车(?)</a>\n" +
    "    </li>\n" +
    "  </ul>\n" +
    "</nav>";

var onSelect = "<div class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" id=\"onSelect\">\n" +
    "        <div class=\"modal-dialog\" role=\"document\">\n" +
    "            <div class=\"modal-content\">\n" +
    "                <div class=\"modal-header\">\n" +
    "                    <h4 class=\"modal-title\">正在查询中...</h4>\n" +
    "                </div>\n" +
    "                <div class=\"modal-body\">\n" +
    "                    <div class=\"progress\">\n" +
    "                        <div class=\"progress-bar progress-bar-striped active\" role=\"progressbar\" aria-valuenow=\"45\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 100%\">\n" +
    "                            <span class=\"sr-only\">100%</span>\n" +
    "                        </div>\n" +
    "                    </div>\n" +
    "                </div>\n" +
    "            </div>\n" +
    "        </div>\n" +
    "    </div>";

function showWaiting() {
    $('#onSelect').modal({
        keyboard: false,
        backdrop: 'static',
        show: true
    });
}

function hideWaiting() {
    $('#onSelect').modal('hide');
}