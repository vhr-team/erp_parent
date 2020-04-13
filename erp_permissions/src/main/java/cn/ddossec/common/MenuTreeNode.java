package cn.ddossec.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MenuTreeNode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer pid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String href;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String icon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Boolean spread;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String typecode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String target;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<MenuTreeNode> child = new ArrayList<>();

    /**
     * 构造主页左边的树
     *
     * @param id
     * @param pid
     * @param title
     * @param href
     * @param icon
     * @param spread
     * @param target
     */
    public MenuTreeNode(Integer id, Integer pid, String title, String href, String icon, Boolean spread, String target, String typecode) {
        this.id = id;
        this.pid = pid;
        this.title = title;
        this.href = href;
        this.icon = icon;
        this.spread = spread;
        this.target = target;
        this.typecode = typecode;
    }

    public static class MenuTreeNodeBuilder {

        public static List<MenuTreeNode> build(List<MenuTreeNode> treeNodes, Integer topId) {
            List<MenuTreeNode> nodes = new ArrayList<>();

            for (MenuTreeNode n1 : treeNodes) {
                if (n1.getPid().equals(topId)) {
                    nodes.add(n1);
                }
                for (MenuTreeNode n2 : treeNodes) {
                    if (n2.getPid().equals(n1.getId())) {
                        n1.getChild().add(n2);
                    }
                }
            }
            return nodes;
        }

    }

}
