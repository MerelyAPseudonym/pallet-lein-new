#!/bin/bash

# start the release of pallet-lein-new

if [[ $# -lt 2 ]]; then
  echo "usage: $(basename $0) previous-version new-version" >&2
  exit 1
fi

previous_version=$1
version=$2

echo ""
echo "Start release of $version, previous version is $previous_version"
echo ""
echo ""

git flow release start $version || exit

echo ""
echo ""
echo "Changes since $previous_version"
git log --pretty=changelog $previous_version..
echo ""
echo ""
echo "Now edit project.clj, ReleaseNotes and README"

$EDITOR project.clj
$EDITOR ReleaseNotes.md
$EDITOR README.md
