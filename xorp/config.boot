/*XORP Configuration File, v1.0*/
protocols {
    fib2mrib {
        disable: true
    }
}
fea {
    unicast-forwarding4 {
        disable: false
        forwarding-entries {
            retain-on-startup: true
            retain-on-shutdown: true
        }
    }
}
interfaces {
    restore-original-config-on-shutdown: true
    interface eth0 {
        description: ""
        disable: false
        discard: false
        unreachable: false
        management: false
        default-system-config {
        }
    }
}
rtrmgr {
    config-directory: "/etc/xorp/"
    load-file-command: "fetch"
    load-file-command-args: "-o"
    load-ftp-command: "fetch"
    load-ftp-command-args: "-o"
    load-http-command: "fetch"
    load-http-command-args: "-o"
    load-tftp-command: "sh -c 'echo Not implemented 1>&2 && exit 1'"
    load-tftp-command-args: ""
    save-file-command: "sh -c 'echo Not implemented 1>&2 && exit 1'"
    save-file-command-args: ""
    save-ftp-command: "sh -c 'echo Not implemented 1>&2 && exit 1'"
    save-ftp-command-args: ""
    save-http-command: "sh -c 'echo Not implemented 1>&2 && exit 1'"
    save-http-command-args: ""
    save-tftp-command: "sh -c 'echo Not implemented 1>&2 && exit 1'"
    save-tftp-command-args: ""
}
