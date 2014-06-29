# Copyright (C) 2013, 2014 Freescale Semiconductor

include recipes-bsp/imx-lib/imx-lib.inc

# FIXME: Drop 'beta' suffix for GA release
SRC_URI = "${FSL_MIRROR}/${PN}-${PV}-beta.tar.gz \
          file://linux-lib-Disable-rng-and-sahara-for-imx-6-solox.patch"

S="${WORKDIR}/${PN}-${PV}-beta"

PE = "1"

SRC_URI[md5sum] = "82d3cd1a6104a0793f7eb4bf53dafead"
SRC_URI[sha256sum] = "4a24d8e09db6154b5813bb7907842c11a8d71e422d9af87c32eab0d32fe12bc0"

PLATFORM_mx6sl = "IMX6S"
PLATFORM_mx6sx = "IMX6S"

COMPATIBLE_MACHINE = "(mx6)"
