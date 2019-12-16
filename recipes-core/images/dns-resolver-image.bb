require recipes-extended/images/core-image-full-cmdline.bb
#../../../openembedded-core/meta/recipes-extended/images/core-image-full-cmdline.bb

IMAGE_INSTALL += "vim-tiny"
IMAGE_INSTALL += "unbound"
IMAGE_INSTALL += "coreutils"

# Replace busybox
DISTRO_FEATURES_remove = " busybox"
PREFERRED_PROVIDER_virtual/base-utils = "coreutils"
VIRTUAL-RUNTIME_base-utils = "coreutils"
VIRTUAL-RUNTIME_base-utils-hwclock = "util-linux-hwclock"
VIRTUAL-RUNTIME_base-utils-syslog = "rsyslog"

# VIRTUAL-RUNTIME_base-utils = ""
# VIRTUAL-RUNTIME_login_manager = "shadow"

